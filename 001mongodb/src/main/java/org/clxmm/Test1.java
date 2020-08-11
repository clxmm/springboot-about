package org.clxmm;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.sun.corba.se.pept.transport.ContactInfoList;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author clx
 * @date 2020/5/19 10:49
 */
public class Test1 {


    public static void main(String[] args) {
//        test1();
        MongoClient client = new MongoClient("192.168.138.129", 27017);
        MongoDatabase sang = client.getDatabase("sang");
        MongoCollection<Document> c1 = sang.getCollection("c1");

//        test2(c1);

//        insertMany(c1);

//        uodateOne(c1);


        //修改多条数据
//        c1.updateMany(Filters.eq("name","clx1"),
//                new Document("$set",new Document("name","批量修改")));


        //删除一条数据
//        c1.deleteOne(Filters.eq("name","clx0"));

        //删除查询到的所有数据
//        c1.deleteMany(Filters.eq("name", "clx2"));


        // 查询所有文档
//        selectAll(c1);

//
        selectBy(c1);


    }


    public void test3() {
        ServerAddress serverAddress = new ServerAddress("192.168.248.128", 27017);
        List<MongoCredential> credentialsList = new ArrayList<MongoCredential>();
        MongoCredential mc = MongoCredential.createScramSha1Credential("rwuser","sang","123".toCharArray());
        credentialsList.add(mc);
        MongoClientOptions options = MongoClientOptions.builder()
                //设置连接超时时间为10s
                .connectTimeout(1000*10)
                //设置最长等待时间为10s
                .maxWaitTime(1000*10)
                .build();
        MongoClient client = new MongoClient(serverAddress,credentialsList,options);
        MongoDatabase sang = client.getDatabase("sang");
        MongoCollection<Document> c = sang.getCollection("c1");

    }


    //MongoCredential 是一个凭证，第一个参数为用户名，第二个参数是要在哪个数据库中验证，第三个参数是密码的 char 数组，
    // 然后将登录地址封装成一个 ServerAddress，最后将两个参数都传入 MongoClient 中实现登录功能。
    public void test2() {
        ServerAddress serverAddress = new ServerAddress("192.168.138.129", 27017);
        List<MongoCredential> credentialsList = new ArrayList<MongoCredential>();
        MongoCredential mc = MongoCredential.createScramSha1Credential("readuser","sang","123".toCharArray());
        credentialsList.add(mc);
        MongoClient client = new MongoClient(serverAddress,credentialsList);
        MongoDatabase sang = client.getDatabase("sang");
        MongoCollection<Document> c = sang.getCollection("c1");
    }

    //根据条件查询
    private static void selectBy(MongoCollection<Document> c1) {
        FindIterable<Document> documents = c1.find(Filters.eq("name", "clx0"));
        MongoCursor<Document> iterator = documents.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void selectAll(MongoCollection<Document> c1) {
        FindIterable<Document> documents = c1.find();
        MongoCursor<Document> iterator = documents.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //修改一条数据
    private static void uodateOne(MongoCollection<Document> collection) {
        collection.updateOne(Filters.eq("name", "clx0"),
                new Document("$set", new Document("name", "clx000")));
    }


    //添加多条数据
    private static void insertMany(MongoCollection<Document> collection) {
        List<Document> documentList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Document document = new Document();
            document.append("name", "clx" + i);
            documentList.add(document);
        }
        collection.insertMany(documentList);
    }


    // 添加一条数据
    private static void test2(MongoCollection<Document> c1) {
        Document d1 = new Document();
        d1.append("name", "银河帝国").append("author", "阿西莫夫");
        c1.insertOne(d1);
    }


    private static void test1() {

//        System.out.println(c1);
    }


}
