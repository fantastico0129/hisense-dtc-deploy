import{$ as T,Ob as h,aa as A}from"./chunk-XANSBG5R.js";import{Vf as c,e as C,fd as v,jd as p,na as s,nd as f,ne as R,oa as u,od as I,pa as o,qa as d,qe as y,wa as l}from"./chunk-UPYLWRRL.js";var N={cart:{validation:{enabled:!1},selectiveCart:{enabled:!1}}},x={routing:{routes:{cart:{paths:["cart"]}}}},O=Symbol("ORDER_ENTRIES_CONTEXT"),i=class extends R{},tt=(()=>{let e=class e extends i{};e.type="CreateCartEvent";let t=e;return t})(),et=(()=>{let e=class e extends i{};e.type="CreateCartSuccessEvent";let t=e;return t})(),nt=(()=>{let e=class e extends i{};e.type="CreateCartFailEvent";let t=e;return t})(),it=(()=>{let e=class e extends i{};e.type="CartAddEntryEvent";let t=e;return t})(),rt=(()=>{let e=class e extends i{};e.type="CartAddEntrySuccessEvent";let t=e;return t})(),st=(()=>{let e=class e extends i{};e.type="CartAddEntryFailEvent";let t=e;return t})(),ot=(()=>{let e=class e extends i{};e.type="CartRemoveEntryFailEvent";let t=e;return t})(),ct=(()=>{let e=class e extends i{};e.type="CartRemoveEntrySuccessEvent";let t=e;return t})(),at=(()=>{let e=class e extends i{};e.type="CartUpdateEntrySuccessEvent";let t=e;return t})(),dt=(()=>{let e=class e extends i{};e.type="CartUpdateEntryFailEvent";let t=e;return t})(),Et=(()=>{let e=class e extends R{};e.type="CartUiEventAddToCart";let t=e;return t})(),ut=(()=>{let e=class e extends i{};e.type="MergeCartSuccessEvent";let t=e;return t})(),S=(()=>{let e=class e extends i{};e.type="LoadCartEvent";let t=e;return t})(),M=(()=>{let e=class e extends i{};e.type="RemoveCartEvent";let t=e;return t})(),lt=(()=>{let e=class e extends i{};e.type="DeleteCartEvent";let t=e;return t})(),ft=(()=>{let e=class e extends i{};e.type="DeleteCartSuccessEvent";let t=e;return t})(),Rt=(()=>{let e=class e extends i{};e.type="DeleteCartFailEvent";let t=e;return t})(),D=(()=>{let e=class e extends i{};e.type="AddCartVoucherEvent";let t=e;return t})(),Ct=(()=>{let e=class e extends D{};e.type="AddCartVoucherSuccessEvent";let t=e;return t})(),vt=(()=>{let e=class e extends D{};e.type="AddCartVoucherFailEvent";let t=e;return t})(),m=(()=>{let e=class e extends i{};e.type="RemoveCartVoucherEvent";let t=e;return t})(),pt=(()=>{let e=class e extends m{};e.type="RemoveCartVoucherSuccessEvent";let t=e;return t})(),It=(()=>{let e=class e extends m{};e.type="RemoveCartVoucherFailEvent";let t=e;return t})(),g="cartBase",a="cartBaseCore",L="miniCart",U="addToCart",w=(()=>{let e=class e{};e.\u0275fac=function(n){return new(n||e)},e.\u0275prov=s({token:e,factory:()=>c({facade:e,feature:a,methods:["getCart","getCarts","getCartEntity","isStable","createCart","mergeToCurrentCart","loadCart","getEntries","getLastEntry","addEntry","addEntries","removeEntry","updateEntry","getEntry","assignEmail","removeCart","deleteCart","reloadCart","getCartIdByType"],async:!0}),providedIn:"root"});let t=e;return t})(),b=(()=>{let e=class e{constructor(r,n){this.eventService=r,this.multiCartFacade=n,this.subscriptions=new C,this.onCartBaseAction()}onCartBaseAction(){this.subscriptions.add(this.eventService.get(S).subscribe(({userId:r,cartId:n})=>{r&&n&&this.multiCartFacade.loadCart({userId:r,cartId:n})})),this.subscriptions.add(this.eventService.get(M).subscribe(({cartId:r})=>{this.multiCartFacade.removeCart(r)}))}ngOnDestroy(){this.subscriptions.unsubscribe()}};e.\u0275fac=function(n){return new(n||e)(d(y),d(w))},e.\u0275prov=s({token:e,factory:e.\u0275fac,providedIn:"root"});let t=e;return t})(),F=(()=>{let e=class e{constructor(r){}};e.\u0275fac=function(n){return new(n||e)(d(b))},e.\u0275mod=l({type:e}),e.\u0275inj=u({});let t=e;return t})(),k=new o("ActiveCartOrderEntriesContext");function _(){return{featureModules:{[g]:{cmsComponents:["CartApplyCouponComponent","CartComponent","CartProceedToCheckoutComponent","CartTotalsComponent","SaveForLaterComponent","ClearCartComponent"]},[L]:{cmsComponents:["MiniCartComponent"]},[U]:{cmsComponents:["ProductAddToCartComponent"]},[a]:g}}}var yt=(()=>{let e=class e{};e.\u0275fac=function(n){return new(n||e)},e.\u0275mod=l({type:e}),e.\u0275inj=u({providers:[I(_),f(N),f(x)],imports:[F,v.forChild([{path:null,canActivate:[A],component:T,data:{cxRoute:"cart",cxContext:{[O]:k}}}])]});let t=e;return t})(),Tt=(()=>{let e=class e{};e.\u0275fac=function(n){return new(n||e)},e.\u0275prov=s({token:e,factory:function(n){let E=null;return n?E=new(n||e):E=d(p),E},providedIn:"root"});let t=e;return t})(),At=(()=>{let e=class e extends h{};e.type="CartPageEvent";let t=e;return t})(),ht=(()=>{let e=class e{};e.\u0275fac=function(n){return new(n||e)},e.\u0275prov=s({token:e,factory:()=>c({facade:e,feature:a,methods:["getActive","takeActive","getActiveCartId","takeActiveCartId","getEntries","getLastEntry","getLoading","isStable","addEntry","removeEntry","updateEntry","getEntry","addEmail","getAssignedUser","isGuestCart","addEntries","requireLoadedCart","reloadActiveCart","hasPickupItems","hasDeliveryItems","getPickupEntries","getDeliveryEntries"],async:!0}),providedIn:"root"});let t=e;return t})(),gt=(()=>{let e=class e{};e.\u0275fac=function(n){return new(n||e)},e.\u0275prov=s({token:e,factory:()=>c({facade:e,feature:a,methods:["validateCart","getValidationResults"]}),providedIn:"root"});let t=e;return t})(),Dt=(()=>{let e=class e{};e.\u0275fac=function(n){return new(n||e)},e.\u0275prov=s({token:e,factory:()=>c({facade:e,feature:a,methods:["addVoucher","removeVoucher","getAddVoucherResultError","getAddVoucherResultSuccess","getAddVoucherResultLoading","resetAddVoucherProcessingState"],async:!0}),providedIn:"root"});let t=e;return t})(),mt=(()=>{let e=class e{};e.\u0275fac=function(n){return new(n||e)},e.\u0275prov=s({token:e,factory:()=>c({facade:e,feature:a,methods:["getCart","getEntries","isStable","addEntry","removeEntry","updateEntry","getEntry"],async:!0}),providedIn:"root"});let t=e;return t})(),Nt=(()=>{let e=class e{};e.\u0275fac=function(n){return new(n||e)},e.\u0275prov=s({token:e,factory:e.\u0275fac});let t=e;return t})(),V=function(t){return t.ITEM="cx-cart-item",t.LIST_ITEM="cx-cart-item-list-row",t.ITEM_DETAILS="cx-cart-item.details",t.ITEM_CONFIGURATOR_ISSUES="cx-configurator-issues-notification",t.ITEM_BUNDLE_DETAILS="cx-cart-item.bundle-details",t.ITEM_DELIVERY_DETAILS="cx-cart-item.delivery-details",t.ORDER_SUMMARY="cx-order-summary",t.CART_ITEM_LIST="cx-cart-item-list",t.ADD_TO_CART_CONTAINER="cx-add-to-cart-container",t.PICKUP_INFO="cx-pickup-info",t.ADD_TO_CART_PICKUP_OPTION="cx-add-to-cart-pickup-option",t.DELIVERY_MODE="cx-delivery-mode",t.ORDER_OVERVIEW="cx-order-overview",t.CPQ_QUOTE_MODULE="cx-cpq-quote",t.CPQ_QUOTE_HEADING="cx-cpq-quote-heading",t.CPQ_QUOTE="cx-cpq-quote-offer",t}(V||{}),j=function(t){return t.ActiveCart="CART",t.Checkout="CHECKOUT",t.Order="ORDER",t.SaveForLater="SAVE_FOR_LATER",t.SavedCart="SAVED_CART",t}(j||{}),K=function(t){return t.CART="Cart",t.ORDER="Order",t.QUOTE="Quote",t.SAVED_CART="SavedCart",t}(K||{}),W=function(t){return t.ACTIVE="Active",t.WISH_LIST="WishList",t.SELECTIVE="Selective",t.NEW_CREATED="NewCreated",t}(W||{}),P=function(t){return t.NO_STOCK="noStock",t.LOW_STOCK="lowStock",t.REVIEW_CONFIGURATION="reviewConfiguration",t.PRICING_ERROR="pricingError",t.UNRESOLVABLE_ISSUES="unresolvableIssues",t}(P||{}),Q=function(t){return t.ACTIVE_CART="ACTIVE_CART",t.NEW_SAVED_CART="NEW_SAVED_CART",t.QUICK_ORDER="QUICK_ORDER",t.SAVED_CART="SAVED_CART",t.ORDER_CONFIRMATION="ORDER_CONFIRMATION",t.ORDER_DETAILS="ORDER_DETAILS",t.UNIT_ORDER_DETAILS="UNIT_ORDER_DETAILS",t}(Q||{}),q=function(t){return t.SUCCESS="success",t.LOW_STOCK="lowStock",t.NO_STOCK="noStock",t.UNKNOWN_IDENTIFIER="unknownIdentifier",t.UNKNOWN_ERROR="unknownError",t.LIMIT_EXCEEDED="limitExceeded",t}(q||{}),xt=new o("CartNormalizer"),Ot=new o("OrderEntryPromotionsNormalizer"),St=new o("CartModificationNormalizer"),Mt=new o("SaveCartNormalizer"),Lt=new o("CartVoucherNormalizer");export{O as a,i as b,tt as c,et as d,nt as e,it as f,rt as g,st as h,ot as i,ct as j,at as k,dt as l,Et as m,ut as n,S as o,M as p,lt as q,ft as r,Rt as s,D as t,Ct as u,vt as v,m as w,pt as x,It as y,g as z,L as A,U as B,w as C,k as D,yt as E,Tt as F,At as G,ht as H,gt as I,Dt as J,mt as K,Nt as L,V as M,j as N,K as O,W as P,P as Q,Q as R,q as S,xt as T,Ot as U,St as V,Lt as W};
