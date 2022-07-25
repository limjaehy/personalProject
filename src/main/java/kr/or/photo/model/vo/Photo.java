package kr.or.photo.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Photo {
	private int photoNumber; //������
	private int photoCategoryNumber; //�з��ڵ�
	private String photoTitle; //����
	private String photoContent; //����
	private String photoImagepath; //���� �̹���
	private String photoDate; //��¥
}
/*
 CREATE TABLE PHOTO(
    PHOTO_NUMBER NUMBER PRIMARY KEY,
    PHOTO_CATEGORY_NUMBER NUMBER,
    PHOTO_TITLE VARCHAR2(100),
    PHOTO_CONTENT VARCHAR2(300),
    PHOTO_IMAGEPATH VARCHAR2(200),
    PHOTO_DATE DATE
);

CREATE SEQUENCE PHOTO_NUMBER_SEQ;
 */
 