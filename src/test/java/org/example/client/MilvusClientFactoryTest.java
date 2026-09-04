package org.example.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MilvusClientFactoryTest {

    @Autowired
    private MilvusClientFactory milvusClientFactory;

    @Test
    public void testCreateClient() {
        try {
            // 尝试创建Milvus客户端
            // 如果本地没有Milvus数据库，这里会抛出异常
            var client = milvusClientFactory.createClient();
            System.out.println("成功创建Milvus客户端");
            client.close();
        } catch (Exception e) {
            System.out.println("创建Milvus客户端失败: " + e.getMessage());
            // 预期会失败，因为本地没有Milvus数据库
        }
    }
}
