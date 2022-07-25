package kr.or.info.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Info {
	private int myNum;
	private String myName; //�̸�
	private int myAge; //����
	private String subject; //������
	private String studyAddress; //������ּ�
	private String myAddress; //�ּ�
	private String infoUpdateDate; //�������� �ֱ� ������¥
}

/*
 사용자계정 -> ID:PERSONAL, PW:PERSONAL
 
 CREATE TABLE info(
    MY_NUM NUMBER PRIMARY KEY,
    MY_NAME VARCHAR2(30),
    MY_AGE NUMBER,
    SUBJECT VARCHAR2(300),
    STUDY_ADDRESS VARCHAR2(300),
    MY_ADDRESS VARCHAR2(300),
    INFO_UPDATE_DATE DATE
);
 */