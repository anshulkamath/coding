//
//  JBMStockHolding.m
//  Stocks
//
//  Created by Anshul Kamath on 4/6/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import "JBMStockHolding.h"

@implementation JBMStockHolding

- (float)purchasePrice
{
    return _purchasePrice;
}
- (void)setPurchasePrice:(float)p
{
    _purchasePrice = p;
}
- (float)currentPrice;
{
    return _currentPrice;
}
- (void)setCurrentPrice:(float)c
{
    _currentPrice = c;
}
- (float)numberOfShares;
{
    return _numberOfShares;
}
- (void)setNumberOfShares:(float)n
{
    _numberOfShares = n;
}
- (float)costInDollars
{
    return _purchasePrice * _numberOfShares;
}
- (float)valueInDollars
{
    return _currentPrice * _numberOfShares;
}


@end
