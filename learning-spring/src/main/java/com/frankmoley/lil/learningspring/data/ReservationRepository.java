package com.frankmoley.lil.learningspring.data;

import java.time.LocalDate;
import java.util.List;
import java.sql.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long>{
	Iterable<Reservation> findReservationByResDate(Date date);

//		@Query(value = "SELECT * RESERVATION WHERE RES_DATE = :resDate")
//		public List<Reservation> getTheReservationForAReservationDate(@Param("resDate") LocalDate resDate);


}
