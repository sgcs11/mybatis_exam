package com.ll.exam.app_2022_09_23;

import com.ll.exam.app_2022_09_23.article.service.ArticleService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class AppTest {
	@Autowired
	private ArticleService articleService;

	@Test
	@DisplayName("게시물 리스트 반환")
	void t1() {
		articleService.getArticles();
	}

	@Test
	@DisplayName("게시물 작성")
	void t2() {
		articleService.write("제목3", "내용3");
	}

}
