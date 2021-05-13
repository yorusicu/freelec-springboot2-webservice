package com.practice.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Entity 클래스, PK타입>을 상속하면 기본적인 CRUD메서드가 자동생성됨.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
