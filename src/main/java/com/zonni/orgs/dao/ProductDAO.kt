package com.zonni.orgs.dao

import com.zonni.orgs.modelo.Product

class ProductDAO {

    fun add(product: Product) {
        list_product.add(product)
    }

    fun searchAll(): List<Product> {
        return list_product.toList()
    }

    companion object {
        private val list_product = mutableListOf<Product>(
            Product("Laranja", "Laranja suculenta!", "https://longevidadesaudavel.com.br/wp-content/uploads/2023/07/10.png", price = "2.50".toBigDecimal()),
            Product("Livro", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vehicula lacus et semper sagittis. Duis gravida purus non diam egestas aliquet. Fusce tincidunt ex in magna pharetra, non pretium odio dapibus. Sed placerat dignissim nulla. Sed tellus risus, consequat vel dignissim sed, malesuada et sem. Interdum et malesuada fames ac ante ipsum primis in faucibus. In tempus nec nunc in fermentum. Maecenas rhoncus sem convallis, interdum ante eget, fringilla dolor. Etiam auctor ante nec erat aliquam, in iaculis erat ultricies. Donec molestie et libero in viverra. Donec ut vehicula lorem. Aliquam erat volutpat. Etiam aliquet, dui ut bibendum placerat, est risus sodales dolor, non pretium justo eros vitae nulla. Vivamus posuere a magna ac fermentum. Donec turpis diam, cursus sed scelerisque a, aliquam sollicitudin lorem.\n" +
                    "\n" +
                    "Ut vestibulum erat non sapien volutpat vehicula. Mauris eu sodales ipsum, non placerat urna. Proin non nibh feugiat, vestibulum ex et, mattis mauris. Nulla facilisi. Aenean tempor vel lacus in commodo. Aliquam luctus velit risus, ac varius sapien lacinia ac. Donec a arcu eget magna mollis aliquam. Nulla facilisi. Donec et efficitur augue, in consectetur metus. Sed et massa a magna lobortis ullamcorper sed et metus. Nunc sodales, sapien nec cursus facilisis, massa neque dictum sem, eu gravida quam eros nec tortor.\n" +
                    "\n" +
                    "Donec lacinia efficitur diam nec sodales. Pellentesque ultrices enim metus, eget porttitor mauris vehicula vitae. Pellentesque nec eros turpis. Donec rutrum leo at viverra malesuada. Phasellus et blandit turpis. Vestibulum sollicitudin dignissim magna at dignissim. Nulla blandit finibus dui. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nulla porttitor mi eros, vel suscipit sem pulvinar quis. Integer quam ex, ultricies convallis pharetra ac, viverra quis nunc. Donec sit amet orci eu magna ultricies finibus non a ligula. Aenean a hendrerit nunc, consequat iaculis sem. Pellentesque sed maximus ligula. Phasellus ut libero non magna fringilla posuere.\n" +
                    "\n" +
                    "Pellentesque dolor nulla, ullamcorper sed vehicula efficitur, accumsan in sapien. Suspendisse laoreet lorem vel nulla condimentum, et dignissim lacus maximus. Mauris convallis id metus sed sodales. Nam vitae consequat ante. In ultricies mauris et ex iaculis, vitae sodales metus sagittis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Etiam consectetur ex ex, sed aliquet odio sollicitudin consectetur. Duis eget convallis justo, venenatis ultricies nunc. Suspendisse accumsan condimentum est, non bibendum est suscipit vitae. Curabitur nisi mauris, iaculis ullamcorper accumsan et, laoreet vel sapien. Pellentesque vitae libero eget ante mattis dignissim. Fusce non nulla nunc.\n" +
                    "\n" +
                    "Cras leo nulla, pretium vel fringilla ac, facilisis eu velit. Donec in metus sed urna laoreet gravida. Pellentesque congue tristique ante, id accumsan est vulputate eget. Quisque lacinia fringilla rhoncus. Maecenas tincidunt lacus tincidunt venenatis semper. Nam porttitor magna sit amet ante ornare hendrerit. Integer aliquam, massa at euismod ullamcorper, turpis neque rhoncus tortor, suscipit pretium urna orci a nunc. Sed condimentum vitae leo non consequat. Nulla porta finibus malesuada. Sed ut risus pharetra, varius lectus at, ullamcorper felis. Sed ultricies felis eu justo dapibus, in volutpat nunc facilisis. Integer rutrum facilisis viverra. Integer non imperdiet metus, in eleifend enim.", "https://i0.wp.com/www.olivroaberto.com.br/wp-content/uploads/2015/11/livro-sonho.jpg?fit=1125%2C916&ssl=1", price = "2.50".toBigDecimal())
        )
    }

}