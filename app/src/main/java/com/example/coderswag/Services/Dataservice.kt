package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object Dataservice {
    val categories= listOf(
        Category("SHIRTS","shirtimage"),
        Category("HODDIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats= listOf(
        Product("Hat Beanie","$20","hat1"),
        Product("Hat Black","$22","hat2"),
        Product("Hat White","$19","hat3"),
        Product("Hat Snapback","$23","hat4")
    )

    val hoodies= listOf(
        Product("Hoodie Gray","$32","hoodie1"),
        Product("Hoodie Red","$36","hoodie2"),
        Product("Hoodie Dark Grey ","$33","hoodie3"),
        Product("Black Hoodie","$34","hoodie4")
    )

    val shirts= listOf(
        Product("Shirt Black","18","shirt1"),
        Product("Baadge Light Gray Shirt","$20","shirt2"),
        Product("Logo Shirt Red","$24","shirt3"),
        Product("Hustle Shirt","$25","shirt4"),
        Product("KickFlip Studios Shirt","$21","shirt5")
    )
}