package com.sidehustle.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sidehustle.beans.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {


	List<Task> findAllByU_ID(int u_id);
		
	}

