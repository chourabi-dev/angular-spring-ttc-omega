import { Component, OnInit } from '@angular/core';
import { CartService } from 'src/app/cart.service';

@Component({
  selector: 'app-cart-page',
  templateUrl: './cart-page.component.html',
  styleUrls: ['./cart-page.component.css']
})
export class CartPageComponent implements OnInit {

  ShoppingProduct:any[] = [];

  constructor(private cart:CartService) { }

  ngOnInit(): void {
    this.ShoppingProduct = this.cart.getShoppingList();
  }

}
