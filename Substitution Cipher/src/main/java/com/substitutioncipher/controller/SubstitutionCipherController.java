package com.substitutioncipher.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.substitutioncipher.dao.SubstitutionCipherDao;
import com.substitutioncipher.model.SubstitutionCipherCore;
import com.substitutioncipher.model.SubstitutionCipherMapping;

@Controller
public class SubstitutionCipherController {

	@Autowired
	SubstitutionCipherDao DAO;
	
	@RequestMapping("/encrypt")
	public String encrypt () {
		return "encrypt";
	}
	
	@RequestMapping("/decrypt")
	public String decrypt () {
		return "decrypt";
	}
	
	@RequestMapping(value = "/save", method= RequestMethod.POST)
	public String save (HttpServletRequest request, Model model) {
		
		String action = request.getParameter("action");

		if ("Encrypt".equals(action)) {
			String msg = request.getParameter("message");		
			String encmessage = SubstitutionCipherCore.msgmapping(msg);
			model.addAttribute("finalEncrypted", encmessage);
			return "encryptedmessage";
		} else if ("Decrypt".equals(action))  {
			String ciphmsg = request.getParameter("ciphertext");
			String decmessage = SubstitutionCipherCore.msgmapping(ciphmsg);
			model.addAttribute("finalDecrypted", decmessage);
			return "decryptedmessage";
		}
		else {
			return null;
		}

	}

}
