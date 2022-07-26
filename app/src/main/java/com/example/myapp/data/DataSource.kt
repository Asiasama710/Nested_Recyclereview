package com.example.myapp.data

import com.example.myapp.data.domin.Largemeal
import com.example.myapp.data.domin.Smallmeal

object DataSource {
//fake data
    fun getSmallMeal():List<Smallmeal> = listOf(
        Smallmeal(1,"pizaa","https://tmbidigitalassetsazure.blob.core.windows.net/rms3-prod/attachments/37/1200x1200/Pizza-from-Scratch_EXPS_FT20_8621_F_0505_1_home.jpg","pizaa is good chose"),
        Smallmeal(2,"finger chips","https://aubreyskitchen.com/wp-content/uploads/2021/01/frozen-french-fries-in-air-fryer-500x500.jpg","figer chpse is bettr for dite"),
        Smallmeal(3,"pizaa","https://tmbidigitalassetsazure.blob.core.windows.net/rms3-prod/attachments/37/1200x1200/Pizza-from-Scratch_EXPS_FT20_8621_F_0505_1_home.jpg","pizaa is good chose"),
        Smallmeal(4,"finger chips","https://aubreyskitchen.com/wp-content/uploads/2021/01/frozen-french-fries-in-air-fryer-500x500.jpg","figer chpse is bettr for dite"),
        Smallmeal(5,"pizaa","https://tmbidigitalassetsazure.blob.core.windows.net/rms3-prod/attachments/37/1200x1200/Pizza-from-Scratch_EXPS_FT20_8621_F_0505_1_home.jpg","pizaa is good chose"),
        Smallmeal(6,"finger chips","https://aubreyskitchen.com/wp-content/uploads/2021/01/frozen-french-fries-in-air-fryer-500x500.jpg","figer chpse is bettr for dite"),
        Smallmeal(7,"pizaa","https://tmbidigitalassetsazure.blob.core.windows.net/rms3-prod/attachments/37/1200x1200/Pizza-from-Scratch_EXPS_FT20_8621_F_0505_1_home.jpg","pizaa is good chose"),
        Smallmeal(8,"finger chips","https://aubreyskitchen.com/wp-content/uploads/2021/01/frozen-french-fries-in-air-fryer-500x500.jpg","figer chpse is bettr for dite"),

    )
    fun getLargeMeal():List<Largemeal> = listOf(
        Largemeal(1," Chicken Nuggets","https://s28194.pcdn.co/wp-content/uploads/2018/08/shutterstock_653277379.jpg","Craving for sumptuous restaurant-style crispy Chicken Nuggets?"),
        Largemeal(2,"Chicken breasts","https://i2.wp.com/www.downshiftology.com/wp-content/uploads/2021/04/Herb-Baked-Chicken-Breast-11-1024x1536.jpg","Herb baked chicken breasts make for the perfect weeknight dinner"),
        Largemeal(3," Chicken Nuggets","https://s28194.pcdn.co/wp-content/uploads/2018/08/shutterstock_653277379.jpg","Craving for sumptuous restaurant-style crispy Chicken Nuggets?"),
        Largemeal(4,"Chicken breasts","https://i2.wp.com/www.downshiftology.com/wp-content/uploads/2021/04/Herb-Baked-Chicken-Breast-11-1024x1536.jpg","Herb baked chicken breasts make for the perfect weeknight dinner"),
        Largemeal(5," Chicken Nuggets","https://s28194.pcdn.co/wp-content/uploads/2018/08/shutterstock_653277379.jpg","Craving for sumptuous restaurant-style crispy Chicken Nuggets?"),
        Largemeal(6,"Chicken breasts","https://i2.wp.com/www.downshiftology.com/wp-content/uploads/2021/04/Herb-Baked-Chicken-Breast-11-1024x1536.jpg","Herb baked chicken breasts make for the perfect weeknight dinner"),
        Largemeal(7," Chicken Nuggets","https://s28194.pcdn.co/wp-content/uploads/2018/08/shutterstock_653277379.jpg","Craving for sumptuous restaurant-style crispy Chicken Nuggets?"),
        Largemeal(8,"Chicken breasts","https://i2.wp.com/www.downshiftology.com/wp-content/uploads/2021/04/Herb-Baked-Chicken-Breast-11-1024x1536.jpg","Herb baked chicken breasts make for the perfect weeknight dinner"),

        )
}