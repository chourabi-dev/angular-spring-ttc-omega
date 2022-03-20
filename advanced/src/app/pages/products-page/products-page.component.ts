import { Component, OnInit } from '@angular/core';
import { CartService } from 'src/app/cart.service';

@Component({
  selector: 'app-products-page',
  templateUrl: './products-page.component.html',
  styleUrls: ['./products-page.component.css']
})
export class ProductsPageComponent implements OnInit {

  products:any[] = [
    { id:1, name:'Samsung A12' },
    { id:2, name:'Samsung A50' },
    { id:3, name:'Samsung A52' },
    
  ]

  cartArray:any[]=[];


  constructor(private cart:CartService) { }

  ngOnInit(): void {
    this.cartArray = this.cart.getShoppingList();
  }


  saveProduct(p:any){
    this.cart.addNewProduct(p);
    //alert('product saved');
  }


}
