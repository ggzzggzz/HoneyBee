package com.team.honeybee.domain;

import java.time.*;

import lombok.*;

@Data
public class MemberDto {
	private String memberId;
	private String pw;
	private String email;
	private String name;
	private String nickname;
	private LocalDateTime inserted;
}
