import{H as et,c as tt}from"./chunk-WSSBQI4V.js";import{R as J,T as K,U as Z}from"./chunk-XANSBG5R.js";import{$a as q,Bb as y,Ib as R,Jb as c,Mf as z,Nf as H,Ob as r,Pa as m,Pb as s,Qa as j,Qb as u,S as T,Xd as _,_a as D,ab as d,ae as O,cf as G,dd as w,ea as f,fa as C,fd as b,gb as l,ha as F,hb as h,he as Q,ib as E,ic as $,ie as V,mf as X,na as P,nc as k,nd as N,nf as Y,oa as B,pb as L,qa as o,qe as W,r as v,tc as U,u as a,v as I,va as A,wa as M,zb as g}from"./chunk-UPYLWRRL.js";var rt=i=>({quantity:i}),S=i=>({count:i}),at=()=>({cxRoute:"cart"}),ot=i=>({total:i});function ct(i,t){if(i&1&&(l(0,"a",1),r(1,"cxTranslate"),r(2,"cxUrl"),r(3,"cxTranslate"),E(4,"cx-icon",2),l(5,"span",3),g(6),r(7,"async"),r(8,"cxTranslate"),h(),l(9,"span",4),g(10),r(11,"async"),r(12,"cxTranslate"),h()()),i&2){let x=t.ngIf,e=L();d("title",u(1,6,"miniCart.item",c(24,S,x.quantity)))("routerLink",s(2,9,R(26,at))),q("aria-label",u(3,11,"miniCart.item",c(27,S,x.quantity))),m(4),d("type",e.iconTypes.CART),m(2),y(" ",u(8,16,"miniCart.total",c(29,ot,s(7,14,e.total$)))," "),m(4),y(" ",u(12,21,"miniCart.count",c(31,S,s(11,19,e.quantity$)))," ")}}var pt=(()=>{let t=class t{constructor(e,n,p,it,nt){this.activeCartFacade=e,this.authService=n,this.statePersistenceService=p,this.siteContextParamsService=it,this.eventService=nt}getQuantity(){return this.activeCartRequired().pipe(C(e=>e?this.activeCartFacade.getActive().pipe(f({totalUnitCount:0}),a(n=>n.totalUnitCount||0)):v(0)))}getTotalPrice(){return this.activeCartRequired().pipe(C(e=>e?this.activeCartFacade.getActive().pipe(a(n=>n.totalPrice?.formattedValue??"")):v("")))}activeCartRequired(){return I([this.hasActiveCartInStorage(),this.authService.isUserLoggedIn(),this.isCartCreated()]).pipe(a(([e,n,p])=>e||n||p),T(),F(e=>!e,!0))}hasActiveCartInStorage(){return this.getCartStateFromBrowserStorage().pipe(a(e=>!!e?.active))}isCartCreated(){return this.eventService.get(tt).pipe(a(e=>!0),f(!1))}getCartStateFromBrowserStorage(){return this.siteContextParamsService.getValues([_]).pipe(a(e=>this.statePersistenceService.readStateFromStorage({key:"cart",context:e,storageType:Q.LOCAL_STORAGE})))}};t.\u0275fac=function(n){return new(n||t)(o(et),o(O),o(V),o(G),o(W))},t.\u0275prov=P({token:t,factory:t.\u0275fac,providedIn:"root"});let i=t;return i})(),st=(()=>{let t=class t{constructor(e){this.miniCartComponentService=e,this.iconTypes=J,this.quantity$=this.miniCartComponentService.getQuantity(),this.total$=this.miniCartComponentService.getTotalPrice()}};t.\u0275fac=function(n){return new(n||t)(j(pt))},t.\u0275cmp=A({type:t,selectors:[["cx-mini-cart"]],decls:2,vars:5,consts:[[3,"title","routerLink",4,"ngIf"],[3,"title","routerLink"],[3,"type"],[1,"total"],[1,"count"]],template:function(n,p){n&1&&(D(0,ct,13,33,"a",0),r(1,"async")),n&2&&d("ngIf",c(3,rt,s(1,1,p.quantity$)))},dependencies:[$,w,K,k,X,z],encapsulation:2,changeDetection:0});let i=t;return i})(),Tt=(()=>{let t=class t{};t.\u0275fac=function(n){return new(n||t)},t.\u0275mod=M({type:t}),t.\u0275inj=B({providers:[N({cmsComponents:{MiniCartComponent:{component:st}}})],imports:[U,b,Y,Z,H]});let i=t;return i})();export{st as MiniCartComponent,pt as MiniCartComponentService,Tt as MiniCartModule};
