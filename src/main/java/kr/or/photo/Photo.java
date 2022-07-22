package kr.or.photo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Photo {
	private int photoSeq; //시퀀스
	private int photoNum; //분류코드
	private String photoTitle; //제목
	private String photoContent; //내용
	private String photoImagePath; //메인 이미지
	private String photoDate; //날짜
}
