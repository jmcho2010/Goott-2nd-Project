package com.test.test1.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test1.admin.dao.AdminDao;
import com.test.test1.admin.dto.AdminETCDto;
import com.test.test1.video.dto.VideoDto;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao adminDao;
	
	@Override
	public int getTotalSales() {
		return adminDao.getTotalSales();
	}

	@Override
	public void deletes(List<Integer> delArr) {	
		adminDao.deletes(delArr);
	}

	@Override
	public int getDailySales() {
		return adminDao.getDailySales();
	}

	@Override
	public int getTodayVisit() {
		return adminDao.getTodayVisit();
	}

	@Override
	public int getTotalVisit() {
		return adminDao.getTotalVisit();
	}

	@Override
	public void videoDel(int video_id) {
		adminDao.videoDel(video_id);
	}

	@Override
	public void videoDels(List<Integer> delArr) {
		adminDao.videoDels(delArr);
	}

	@Override
	public void videoDataModify(VideoDto dto) {
		adminDao.videoDataModify(dto);
	}

	@Override
	public List<AdminETCDto> getCategory() {
		return adminDao.getCategory();
	}

	@Override
	public List<AdminETCDto> getGenre() {
		return adminDao.getGenre();
	}

	@Override
	public void addCategory(String category_name) {
		adminDao.addCategory(category_name);
	}

	@Override
	public void addGenre(String genre_name) {
		adminDao.addGenre(genre_name);
	}

	@Override
	public void delCategory(String category_name) {
		adminDao.delCategory(category_name);
	}

	@Override
	public void delGenre(String genre_name) {
		adminDao.delGenre(genre_name);
	}

}
