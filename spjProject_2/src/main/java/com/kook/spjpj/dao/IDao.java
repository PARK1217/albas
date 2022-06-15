package com.kook.spjpj.dao;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;

import com.kook.spjpj.dto.BDto;
import com.kook.spjpj.dto.JoinDto;
import com.kook.spjpj.dto.QDto;
import com.kook.spjpj.dto.RDto;

public interface IDao {
	//===== join =====
	public String join(JoinDto dto);
	
	//===login====
	public JoinDto login(String bid);
	
	//===== board =====
	public ArrayList<BDto> list();
	public void write(String nic, String title, String content);
	public BDto contentView(String id);
	public void upHit(String bId);
	public void modify(String bId, String bNic, String bTitle, String bContent);
	public void delete(String bId);
	public ArrayList<BDto> pageList(String pageNo);

	// ===== record =====
	public void record(String rcompany, String rnic, String rtime_from, String rtime_to, String rtime_day, String rwage_hour,
			String rwage_day);
	public ArrayList<RDto> wageBill(String rnic);
	//���
	public BDto reply_view(String bId);
	public void reply(String bId, String bName, String bTitle, String bContent, String bGroup, 
			String bStep, String bIndent);
	public void replyShape(String bGroup, String bStep);
	
	
	//===== qnaboard =====
	public ArrayList<QDto> qlist();
	public void qwrite(String qnic, String qtitle, String qcontent);
	public QDto qcontentView(String id);
	public void qupHit(String qId);
	public void qmodify(String qId, String qNic, String qTitle, String qContent);
	public void qdelete(String qId);

	public ArrayList<QDto> qpageList(String qpageNo);


	

