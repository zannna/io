package com.example.demo.repository;

import com.example.demo.entity.AppTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestRepo extends JpaRepository<AppTest, Long> {


    List<AppTest> findByType(int type);
   List<AppTest> findByIdUser(int idUser);
   // w h2 nazwa tabeli to App_Test, a nie AppTest
    @Query(nativeQuery = true, value= "SELECT * FROM App_Test u WHERE u.type= :type ORDER BY u.score DESC LIMIT 2")
    List<AppTest> findBestScores(@Param("type") int type);
}
