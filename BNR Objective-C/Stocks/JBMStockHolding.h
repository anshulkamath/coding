//
//  JBMStockHolding.h
//  Stocks
//
//  Created by Anshul Kamath on 4/6/15.
//  Copyright (c) 2015 JAMBAM LLC. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface JBMStockHolding : NSObject

{
    float _purchasePrice;
    float _currentPrice;
    float _numberOfShares;
}

- (float)purchasePrice;
- (void)setPurchasePrice:(float) p;
- (float)currentPrice;
- (void)setCurrentPrice:(float) c;
- (float)numberOfShares;
- (void)setNumberOfShares:(float) n;
- (float)costInDollars;
- (float)valueInDollars;

@end
