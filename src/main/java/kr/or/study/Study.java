package kr.or.study;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Study {
	private int studySeq; //시퀀스
	private int studyNum; //분류코드
	private String studyTitle; //제목
	private String studyContent; //내용
	private String studyImagePath; //메인 이미지
	private String studyDate; //날짜
}
