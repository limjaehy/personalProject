package kr.or.study.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Study {
	private int studyNumber; //������
	private int studyCategoryNumber; //�з��ڵ�
	private String studyTitle; //����
	private String studyContent; //����
	private String studyImagePath; //���� �̹���
	private String studyDate; //��¥
}
/*
  CREATE TABLE STUDY(
    STUDY_NUMBER NUMBER PRIMARY KEY,
    STUDY_CATEGORY_NUMBER NUMBER,
    STUDY_TITLE VARCHAR2(100),
    STUDY_CONTENT VARCHAR2(300),
    STUDY_IMAGEPATH VARCHAR2(200),
    STUDY_DATE DATE
);
CREATE SEQUENCE STUDY_NUMBER_SEQ;
 */
 