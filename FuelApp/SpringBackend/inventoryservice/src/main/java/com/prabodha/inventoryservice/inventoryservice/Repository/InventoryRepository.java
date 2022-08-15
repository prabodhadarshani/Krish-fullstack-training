package com.prabodha.inventoryservice.inventoryservice.Repository;

//import com.prabodha.basecommons.basecommons.dto.Inventory;
import dto.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository <Inventory, Long> {
    @Query(value = "select * FROM inventory WHERE type = ?1",nativeQuery = true )
   Inventory findByType(String type);

   //@Query(value ="SELECT type FROM inventory") ;


//   @Query("select * FROM inventory WHERE type = ?1",)
//2@Query(value = "select * from inventory u where u.type = :type" , nativeQuery = true)
//Inventory findByType(@Param("type") String type);



  // Inventory findByType(String type);



  // @Query(value ="select * FROM inventory ", nativeQuery = true)
 // @Query(value ="SELECT * FROM inventory e WHERE e.type = ?1 ")
  // Inventory findByType(String type);





  // Inventory  findByType(List<String> type);


//   @Query(value = "SELECT * FROM inventory u WHERE u.type = ?1")
//   Inventory findByType(String type);

//    @Query("select type from inventory s where :type in (VALUE(s.type)")
//    Inventory findByName(String type);


   // Inventory findByName(String type);
}

