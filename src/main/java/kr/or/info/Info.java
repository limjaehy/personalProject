package kr.or.info;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Info {
	private String name; //이름
	private int age; //나이
	private String subject; //배운과목
	private String studyAddress; //깃허브주소
	private String address; //주소
	private String infoUpdateDate; //개인정보 최근 수정날짜
}
