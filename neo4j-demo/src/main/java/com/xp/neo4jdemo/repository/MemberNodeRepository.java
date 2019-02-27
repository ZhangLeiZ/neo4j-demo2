package com.xp.neo4jdemo.repository;


import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.xp.neo4jdemo.domain.MemberNode;

@Repository
public interface MemberNodeRepository extends Neo4jRepository<MemberNode,Long>{

}
