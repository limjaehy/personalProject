package kr.or.info.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Info {
	private String name; //�̸�
	private int age; //����
	private String subject; //������
	private String studyAddress; //������ּ�
	private String address; //�ּ�
	private String infoUpdateDate; //�������� �ֱ� ������¥
}
