import{ga as ct}from"./chunk-XANSBG5R.js";import{$f as k,Ab as W,Ba as G,Bb as y,Ca as H,H as g,Hd as rt,Jb as X,Ma as J,Mf as L,Nf as F,Ob as x,Od as at,P,Pa as o,Pb as C,Qa as v,Qd as z,S as q,Sd as V,Td as ot,_a as f,ab as c,cd as it,fa as A,fc as tt,fd as b,gb as s,hb as p,hc as $,ia as Y,ib as T,ic as Q,jb as O,kb as D,mb as K,na as Z,nc as et,nd as R,nf as M,oa as d,ob as w,pb as l,qa as N,r as U,sb as h,tc as S,u as B,va as I,vd as nt,wa as u,wd as j,zb as m}from"./chunk-UPYLWRRL.js";var ft={backend:{occ:{endpoints:{product:{variants:"products/${productCode}?fields=name,purchasable,baseOptions(DEFAULT),baseProduct,variantOptions(DEFAULT),variantType"}}}}},pt=(()=>{let t=class t{};t.\u0275fac=function(n){return new(n||t)},t.\u0275mod=u({type:t}),t.\u0275inj=d({providers:[R(ft)],imports:[S]});let e=t;return e})();function mt(e,t){if(e&1&&(s(0,"option",4),m(1),p()),e&2){let a=t.$implicit,i=l();h("value",a.code),c("selected",a.code===(i.product==null?null:i.product.code)),o(),y(" ",i.getVariantOptionValue(a.variantOptionQualifiers)," ")}}function gt(e,t){if(e&1&&(s(0,"option",5),m(1),p()),e&2){let a=t.$implicit,i=l();h("value",a.code),c("selected",a.code===(i.product==null?null:i.product.code)),o(),y(" ",i.getVariantOptionValue(a.variantOptionQualifiers)," ")}}var ht=e=>({"selected-variant":e});function yt(e,t){if(e&1&&(s(0,"div",4),m(1),x(2,"cxTranslate"),s(3,"span",5),m(4),p()()),e&2){let a=l();o(),y(" ",C(2,2,"productVariants.style"),": "),o(3),W(a.getVariantOptionValue(a.variants==null?null:a.variants.selected.variantOptionQualifiers))}}function xt(e,t){if(e&1){let a=K();s(0,"li",6)(1,"button",7),w("click",function(){let n=G(a).$implicit,r=l();return H(r.changeStyle(n.code))}),T(2,"img",8),p()()}if(e&2){let a=t.$implicit,i=l();c("ngClass",X(4,ht,a.code===(i.variants==null||i.variants.selected==null?null:i.variants.selected.code))),o(2),h("src",i.getVariantThumbnailUrl(a.variantOptionQualifiers),J),h("title",i.getVariantOptionValue(a.variantOptionQualifiers)),h("alt",i.getVariantOptionValue(a.variantOptionQualifiers))}}function Ct(e,t){if(e&1&&T(0,"cx-product-variant-style-selector",5),e&2){let a=l(3);c("variants",a.variants[a.variantType.STYLE])}}function St(e,t){if(e&1&&T(0,"cx-product-variant-size-selector",6),e&2){let a=l(2).ngIf,i=l();c("product",a)("variants",i.variants[i.variantType.SIZE])}}function _t(e,t){if(e&1&&T(0,"cx-product-variant-color-selector",6),e&2){let a=l(2).ngIf,i=l();c("product",a)("variants",i.variants[i.variantType.COLOR])}}function It(e,t){if(e&1&&(s(0,"div",2),f(1,Ct,1,1,"cx-product-variant-style-selector",3)(2,St,1,2,"cx-product-variant-size-selector",4)(3,_t,1,2,"cx-product-variant-color-selector",4),p()),e&2){let a=l(2);o(),c("ngIf",a.variants[a.variantType.STYLE]),o(),c("ngIf",a.variants[a.variantType.SIZE]),o(),c("ngIf",a.variants[a.variantType.COLOR])}}function Tt(e,t){if(e&1&&(O(0),f(1,It,4,3,"div",1),D()),e&2){let a=t.ngIf;o(),c("ngIf",a.baseOptions==null?null:a.baseOptions.length)}}var Ot=(()=>{let t=class t{constructor(i){this.routingService=i}changeColor(i,n){return i&&this.routingService.go({cxRoute:"product",params:{code:i,name:n}}),null}getVariantOptionValue(i){let n=i.find(r=>r.qualifier===j.COLOR);return n?n.value:""}};t.\u0275fac=function(n){return new(n||t)(v(z))},t.\u0275cmp=I({type:t,selectors:[["cx-product-variant-color-selector"]],inputs:{product:"product",variants:"variants"},decls:7,vars:4,consts:[[1,"variant-selector"],[1,"variant-name"],[1,"form-control","variant-select",3,"change"],[3,"value","selected",4,"ngFor","ngForOf"],[3,"value","selected"]],template:function(n,r){n&1&&(O(0),s(1,"div",0)(2,"div",1),m(3),x(4,"cxTranslate"),p(),s(5,"select",2),w("change",function(_){return r.changeColor(_.target.value,r.product==null?null:r.product.name)}),f(6,mt,2,3,"option",3),p()(),D()),n&2&&(o(3),y("",C(4,2,"productVariants.color"),":"),o(3),c("ngForOf",r.variants==null?null:r.variants.options))},dependencies:[$,L],encapsulation:2,changeDetection:0});let e=t;return e})(),lt=(()=>{let t=class t{};t.\u0275fac=function(n){return new(n||t)},t.\u0275mod=u({type:t}),t.\u0275inj=d({imports:[S,b,M,F]});let e=t;return e})(),Dt=(()=>{let t=class t{constructor(i,n){this.productService=i,this.routingService=n}changeSize(i){return i&&this.productService.get(i,"list").pipe(g(V),P(1)).subscribe(n=>{this.routingService.go({cxRoute:"product",params:n})}),null}getVariantOptionValue(i){let n=i.find(r=>r.qualifier===j.SIZE);return n?n.value:""}};t.\u0275fac=function(n){return new(n||t)(v(k),v(z))},t.\u0275cmp=I({type:t,selectors:[["cx-product-variant-size-selector"]],inputs:{product:"product",variants:"variants"},decls:11,vars:10,consts:[[1,"variant-selector"],[1,"variant-name"],[1,"form-control","variant-select",3,"change"],[3,"value","selected",4,"ngFor","ngForOf"],["href","#",1,"size-guide",3,"title"],[3,"value","selected"]],template:function(n,r){n&1&&(O(0),s(1,"div",0)(2,"div",1),m(3),x(4,"cxTranslate"),p(),s(5,"select",2),w("change",function(_){return r.changeSize(_.target.value)}),f(6,gt,2,3,"option",3),p(),s(7,"a",4),x(8,"cxTranslate"),m(9),x(10,"cxTranslate"),p()(),D()),n&2&&(o(3),y("",C(4,4,"productVariants.size"),":"),o(3),c("ngForOf",r.variants==null?null:r.variants.options),o(),h("title",C(8,6,"productVariants.sizeGuideLabel")),o(2),y(" ",C(10,8,"productVariants.sizeGuideLabel")," "))},dependencies:[$,L],encapsulation:2,changeDetection:0});let e=t;return e})(),dt=(()=>{let t=class t{};t.\u0275fac=function(n){return new(n||t)},t.\u0275mod=u({type:t}),t.\u0275inj=d({imports:[S,b,M,F]});let e=t;return e})(),bt=(()=>{let t=class t{constructor(i,n,r){this.config=i,this.productService=n,this.routingService=r,this.variantQualifier=j}getVariantOptionValue(i){let n=i.find(r=>r.qualifier===j.STYLE);return n?n.value:""}getVariantThumbnailUrl(i){let n=i.find(r=>r.image);return n?`${this.config?.backend?.occ?.baseUrl}${n.image?.url}`:""}changeStyle(i){return i&&this.productService.get(i,"list").pipe(g(V),P(1)).subscribe(n=>{this.routingService.go({cxRoute:"product",params:n})}),null}};t.\u0275fac=function(n){return new(n||t)(v(rt),v(k),v(z))},t.\u0275cmp=I({type:t,selectors:[["cx-product-variant-style-selector"]],inputs:{variants:"variants"},decls:5,vars:2,consts:[[1,"variant-selector"],["class","variant-name",4,"ngIf"],[1,"variant-list"],[3,"ngClass",4,"ngFor","ngForOf"],[1,"variant-name"],[1,"style-name"],[3,"ngClass"],[1,"variant-button",3,"click"],[3,"src","title","alt"]],template:function(n,r){n&1&&(O(0),s(1,"div",0),f(2,yt,5,4,"div",1),s(3,"ul",2),f(4,xt,3,6,"li",3),p()(),D()),n&2&&(o(2),c("ngIf",r.variants.selected),o(2),c("ngForOf",r.variants==null?null:r.variants.options))},dependencies:[tt,$,Q,L],encapsulation:2,changeDetection:0});let e=t;return e})(),ut=(()=>{let t=class t{};t.\u0275fac=function(n){return new(n||t)},t.\u0275mod=u({type:t}),t.\u0275inj=d({imports:[S,b,M,F]});let e=t;return e})(),jt=(()=>{let t=class t{constructor(i){this.currentProductService=i,this.variants={},this.variantType=nt}ngOnInit(){this.product$=this.currentProductService.getProduct().pipe(g(ot),g(i=>!!i.baseOptions),q(),Y(i=>{i.baseOptions.forEach(n=>{n?.variantType&&(this.variants[n.variantType]=n)})}))}};t.\u0275fac=function(n){return new(n||t)(v(ct))},t.\u0275cmp=I({type:t,selectors:[["cx-product-variants-container"]],decls:2,vars:3,consts:[[4,"ngIf"],["class","variant-section",4,"ngIf"],[1,"variant-section"],[3,"variants",4,"ngIf"],[3,"product","variants",4,"ngIf"],[3,"variants"],[3,"product","variants"]],template:function(n,r){n&1&&(f(0,Tt,2,1,"ng-container",0),x(1,"async")),n&2&&c("ngIf",C(1,1,r.product$))},dependencies:[Q,bt,Dt,Ot,et],encapsulation:2,changeDetection:0});let e=t;return e})(),Vt=(()=>{let t=class t{};t.\u0275fac=function(n){return new(n||t)},t.\u0275mod=u({type:t}),t.\u0275inj=d({imports:[S,b,M,F,ut,dt,lt]});let e=t;return e})(),Mt=(()=>{let t=class t{constructor(i,n,r){this.productService=i,this.semanticPathService=n,this.router=r}canActivate(i){let n=i.params?.productCode;return n?this.productService.get(n,"variants").pipe(g(V),A(r=>{if(!r.purchasable){let E=this.findPurchasableProductCode(r);if(E)return this.productService.get(E,"list").pipe(g(V),P(1),B(_=>this.router.createUrlTree(this.semanticPathService.transform({cxRoute:"product",params:_}))))}return U(!0)})):U(!0)}findPurchasableProductCode(i){if(i.variantOptions?.length){let n=i.variantOptions.filter(r=>r.stock&&r.stock.stockLevel?r:!1);return n&&n.length?n[0]?.code:i.variantOptions[0]?.code}}};t.\u0275fac=function(n){return new(n||t)(N(k),N(at),N(it))},t.\u0275prov=Z({token:t,factory:t.\u0275fac,providedIn:"root"});let e=t;return e})(),vt=(()=>{let t=class t{};t.\u0275fac=function(n){return new(n||t)},t.\u0275mod=u({type:t}),t.\u0275inj=d({providers:[R({cmsComponents:{ProductVariantSelectorComponent:{component:jt,guards:[Mt]}}})],imports:[Vt,lt,dt,ut]});let e=t;return e})();var Yt=(()=>{let t=class t{};t.\u0275fac=function(n){return new(n||t)},t.\u0275mod=u({type:t}),t.\u0275inj=d({imports:[pt,vt]});let e=t;return e})();export{Yt as ProductVariantsModule};
