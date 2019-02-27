package com.xp.neo4jdemo.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type = "friend")
public class FriendShip {
    @Id
    @GeneratedValue
    private Long id;
    
    @StartNode
    private MemberNode startNode;
    
    @EndNode
    private MemberNode endNode;
    
	public MemberNode getStartNode() {
		return startNode;
	}

	public void setStartNode(MemberNode startNode) {
		this.startNode = startNode;
	}

	public MemberNode getEndNode() {
		return endNode;
	}

	public void setEndNode(MemberNode endNode) {
		this.endNode = endNode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
