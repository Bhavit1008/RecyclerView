package com.example.recyclerview

import com.example.recyclerview.models.BlogPost

class DataSource {
    companion object{
        fun createDataSet(): ArrayList<BlogPost> {
            val list =  ArrayList<BlogPost>()
            list.add(
                BlogPost("Maruti Suzuki Dzire",
                    "compact sedan",
                    "https://2.bp.blogspot.com/-wS3VWI1yA7s/WrX02IpG7_I/AAAAAAAAUU4/QSXQctxVpqAnjcmhruk89r7Q8gAI0Hh2ACEwYBhgL/s1600/New%2BSwift%2BDzire%2BPictures%2B54.jpg",
                    "Dzire")
            )


            list.add(
                BlogPost("Vitara Brezza",
                    "mid range suv",
                    "https://5.imimg.com/data5/YT/DS/MY-56039126/maruti-suzuki-vitara-brezza-car-500x500.png",
                    "Vitara Brezza")
            )

            list.add(
                BlogPost("Kia Seltos",
                    "premium suv from USA",
                    "https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/Seltos_Pic_0-770x433.png?tLFhs00U.iN5JK26ukJ9bs8JQ1GUJV4V",
                    "Kia Seltos")
            )


            list.add(
                BlogPost("MG Hector",
                    "premium suv",
                    "https://media.zigcdn.com/media/content/2019/May/zw-mghector-unveil-1_720x540_720x540.jpg",
                    "MG Hector")
            )


            list.add(
                BlogPost("Mahindra XUV 500",
                    "Diesel Beast",
                    "https://auto.ndtvimg.com/car-images/big/mahindra/xuv500/mahindra-xuv500.jpg?v=47",
                    "XUV 500")
            )


            list.add(
                BlogPost("Scorpio",
                    "Trailed combination of Jeep and SUV",
                    "https://auto.ndtvimg.com/car-images/big/mahindra/scorpio/mahindra-scorpio.jpg?v=49",
                    "Mahindra Scorpio")
            )



            return list
        }
    }
}