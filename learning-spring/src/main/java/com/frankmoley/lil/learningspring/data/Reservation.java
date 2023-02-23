package com.frankmoley.lil.learningspring.data;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Entity
@Table(name="RESERVATION")
public class Reservation {

//	@Autowired
//    private ReservationRepository reservationRepository;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RESERVATION_ID")
	private Long reservationId;
	

	public Long getReservationId() {
		return reservationId;
	}

	public void setReservationId(Long reservationId) {
		this.reservationId = reservationId;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Long getGuestId() {
		return guestId;
	}

	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}

	@Column(name="ROOM_ID")
	private long roomId;
	@Column(name="GUEST_ID")
	private long guestId;
	
	@Column(name="RES_DATE")
	private Date resDate;

	public Date getResDate() {
		return this.resDate;
	}
	
	public void setResDate(Date date) {
		this.resDate = resDate;
	}

	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", roomId=" + roomId + ", guestId=" + guestId +
		 ", resDate=" + resDate + "]";
	}
	
//	public List<Reservation> findReservationByDate(LocalDate resDate) {
//		return reservationRepository.getTheReservationForAReservationDate(resDate);
//	}

	}
