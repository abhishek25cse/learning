package com.test.walmart;

/* 
 * BSTn-1
    target sum
      node 1+node 2  = target 
      
 
 
  root : if more than tgt   = 4
          
              --> 11
    5  --> 10 --> 6
       --> 2  --> 3
              --> 1
              O(N) = solution
              
              
              O(N)
              infix == 1,2,3,3,3,5,6,10,11  
              O(N)  map= save infix into map   --HashMap<Integer, Integer> number, count 
              O(N) for all in infix
                if (ele < tar) 
                    if(tar-ele is present in map)   == diff    O(n)
                        
                      pair found 
                      
                      
                      
                      1,1/0
                      2,1
                     3,3/2
                      5,1
                      6,1
                      10,1
                      11,1                      1
                      
                      
                      tar  = 4
                      ele = 1
                      diff =3
                      
            =================================================
            stocks  = 
              max profit
                        best days to buy and sell
                            
                            
                            date    price
 1        100
 2        200
 3        150
 4        180
 zz11qq
 diff should be max
 
 
 - sell - buy should be profit
 - date(sell) > date(buy)
 
 
 brute -- n2
 
 sort, nlogn
 n/2         
                      
 * 
 */
public class Sept21 {

}
