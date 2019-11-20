package com.example.demo.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TeamMapper;
import com.example.demo.pojo.Team;

@Service
public class TeamService {
	@Autowired
	TeamMapper teamMapper;

	public List<Team> select() {
		return teamMapper.servlce();
	}

	public Team selectbyid(int id) {
		
		return teamMapper.selct(id);
	}

}
