package kr.or.study.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Study {
	private int studySeq; //������
	private int studyNum; //�з��ڵ�
	private String studyTitle; //����
	private String studyContent; //����
	private String studyImagePath; //���� �̹���
	private String studyDate; //��¥
}
