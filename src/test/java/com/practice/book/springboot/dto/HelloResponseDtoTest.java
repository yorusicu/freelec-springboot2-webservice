package com.practice.book.springboot.dto;

import com.practice.book.springboot.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        // given: 테스트를 위해 준비하는 과정
        String name = "test";
        int amount = 1000;

        //when: 실제로 액션을 하는 테스트를 실행하는 과정
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then: 테스트를 검증하는 과정
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);

        // Given - When - Then Pattern은 필수사항 아님.
    }
}
