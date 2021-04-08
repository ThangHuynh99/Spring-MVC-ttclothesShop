package com.laptrinhjavaweb.api.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.laptrinhjavaweb.dto.GioHangDTO;
import com.laptrinhjavaweb.util.CheckCart;

@RestController
@CrossOrigin
@RequestMapping("/api")
@SessionAttributes("giohang")
public class GioHangAPI {

	private CheckCart checkCart = new CheckCart();
	private List<GioHangDTO> giohangs = new ArrayList<>();

	@PostMapping("/addCart")
	public void addGioHang(@RequestBody GioHangDTO giohang, HttpSession httpSession) {
		checkCart.addCart(giohangs, httpSession, giohang);
	}

}
