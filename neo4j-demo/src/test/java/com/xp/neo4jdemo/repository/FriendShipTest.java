package com.xp.neo4jdemo.repository;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.xp.neo4jdemo.Neo4jDemoApplicationTests;
import com.xp.neo4jdemo.domain.FriendShip;
import com.xp.neo4jdemo.domain.MemberNode;
@Component
public class FriendShipTest extends Neo4jDemoApplicationTests {
    Logger logger = LoggerFactory.getLogger(FriendShipTest.class);
    
    @Resource
    private MemberNodeRepository memberNodeRepository;
    @Resource
    private FriendShipRepository friendShipRepository;

//    demo1		MappingException: Field with primary id is null for entity com.xp.neo4jdemo.domain.MemberNode@4f363abd
    @Test
    public void test1(){
        MemberNode startNode = new MemberNode();
        startNode.setId(1);
        startNode.setNickName("小飞机");
        startNode.setTrade("手机数码");
        
        MemberNode endNode = new MemberNode();
        endNode.setId(2);
        endNode.setNickName("大飞机");
        endNode.setTrade("图书影音");
        
        FriendShip ship1 = new FriendShip();
        ship1.setStartNode(startNode);
        ship1.setEndNode(endNode);
        friendShipRepository.save(ship1);
        
        FriendShip ship2 = new FriendShip();
        ship2.setStartNode(startNode);
        ship2.setEndNode(endNode);
        friendShipRepository.save(ship2);
    }
    
    @Test
    public void test2(){
    	 MemberNode startNode = new MemberNode();
         startNode.setId(1);
         
         MemberNode endNode = new MemberNode();
         endNode.setId(2);
         
         FriendShip ship1 = new FriendShip();
         ship1.setStartNode(startNode);
         ship1.setEndNode(endNode);
         friendShipRepository.save(ship1);
         
         FriendShip ship2 = new FriendShip();
         ship2.setStartNode(startNode);
         ship2.setEndNode(endNode);
         friendShipRepository.save(ship2);
    }
    
    
    
    @Test
    public void test3(){
    	memberNodeRepository.deleteAll();
    	friendShipRepository.deleteAll();
    }
    
    
    
//    api定义
    /**
     * 单个节点	crud
     * 
     * 对节点间的关系进行crud
     * 
     * 查询某个节点的二度人脉

     * 查询某两个
     */
}