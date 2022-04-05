package com.ttcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ttcdemo.entities.Clients;
import com.ttcdemo.entities.Product;
import com.ttcdemo.entities.Sells;
import com.ttcdemo.models.SellsModel;
import com.ttcdemo.response.JsonResponse;
import com.ttcdemo.services.SellsServices;

@RequestMapping("/sells")
@RestController
@CrossOrigin(origins = "*")
public class SellsController {

	@Autowired
	private SellsServices sellsService;
	
	@GetMapping("/list")
	List<Sells> getAll(){
		return this.sellsService.getSellsRepository().findAll();
	}
	
	@PostMapping("/add")
	ResponseEntity<?> newSell( @RequestBody List<SellsModel> list ) {
		int ok = 0;
		int err = 0;
		
		
		
		for( SellsModel tmp:list ) {
			try {
				Sells sell = new Sells();
				
				// get associated product and client
				Clients client = this.sellsService.getClientsRepository().findById( tmp.getClient() ).get();
				Product product = this.sellsService.getProductRepository().findById( tmp.getProduct() ).get();
				
				// check if product quantity <= requested quantity !!!
				if( product.getQuantity() >= tmp.getQuantity() ) {
					product.setQuantity(  product.getQuantity() - tmp.getQuantity() );
					
					// save the product !!!
					this.sellsService.getProductRepository().save(product);
					
					sell.setQuantity(tmp.getQuantity());
					sell.setClient(client);
					sell.setProduct(product);

					this.sellsService.getSellsRepository().save(sell);
					ok++;
				}else {
					// oups !!
					err++;
				}
			}catch(Exception e) {
				err++;
			}
			
		}
		
		JsonResponse res = new JsonResponse();
		res.setSuccess(true);
		res.setMessage( ok+" product inserted, "+err+ " product not inserted !" );
		
		return ResponseEntity.ok(res);
		
	}
}
