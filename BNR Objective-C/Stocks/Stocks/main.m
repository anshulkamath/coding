//
//  main.m
//  Stocks
//
//  Created by Anshul Kamath on 4/6/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "JBMStockHolding.h"

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        
        //Creating instances of JBMStockHolding
        JBMStockHolding *one = [[JBMStockHolding alloc] init];
        JBMStockHolding *two = [[JBMStockHolding alloc] init];
        JBMStockHolding *three = [[JBMStockHolding alloc] init];
        
        //Defining one and setting variables
        [one setPurchasePrice:2.30];
        float opp = [one purchasePrice];
        [one setCurrentPrice:4.50];
        float ocp = [one currentPrice];
        [one setNumberOfShares:40];
        float ons = [one numberOfShares];
        
        //Defining two
        [two setPurchasePrice:12.19];
        float tpp = [two purchasePrice];
        [two setCurrentPrice:10.56];
        float tcp = [two currentPrice];
        [two setNumberOfShares:90];
        float tns = [two numberOfShares];
        
        //Defining three
        [three setPurchasePrice:45.10];
        float thpp = [three purchasePrice];
        [three setCurrentPrice:49.51];
        float thcp = [three currentPrice];
        [three setNumberOfShares:90];
        float thns = [three numberOfShares];
        
        //Methods
        float ocid = [one costInDollars];
        float ovid = [one valueInDollars];
        
        float tcid = [two costInDollars];
        float tvid = [two valueInDollars];
        
        float thcid = [three costInDollars];
        float thvid = [three valueInDollars];
        
        //Arrays
        NSArray *ones = @[opp, ocp, ons, ocid, ovid];
        
        
        
    }
    return 0;
}
