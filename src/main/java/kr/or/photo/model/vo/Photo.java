package kr.or.photo.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Photo {
	private int photoSeq; //������
	private int photoNum; //�з��ڵ�
	private String photoTitle; //����
	private String photoContent; //����
	private String photoImagePath; //���� �̹���
	private String photoDate; //��¥
}
