(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/news-detail/news-detail"],{"2c4a":function(t,n,e){"use strict";(function(t){e("533b");r(e("66fd"));var n=r(e("3504"));function r(t){return t&&t.__esModule?t:{default:t}}t(n.default)}).call(this,e("543d")["createPage"])},3504:function(t,n,e){"use strict";e.r(n);var r=e("c430"),a=e("4977");for(var u in a)"default"!==u&&function(t){e.d(n,t,(function(){return a[t]}))}(u);e("8fb6");var c,i=e("f0c5"),o=Object(i["a"])(a["default"],r["b"],r["c"],!1,null,"3b1ac260",null,!1,r["a"],c);n["default"]=o.exports},"3f20":function(t,n,e){"use strict";Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=a(e("a34a"));function a(t){return t&&t.__esModule?t:{default:t}}function u(t,n,e,r,a,u,c){try{var i=t[u](c),o=i.value}catch(f){return void e(f)}i.done?n(o):Promise.resolve(o).then(r,a)}function c(t){return function(){var n=this,e=arguments;return new Promise((function(r,a){var c=t.apply(n,e);function i(t){u(c,r,a,i,o,"next",t)}function o(t){u(c,r,a,i,o,"throw",t)}i(void 0)}))}}var i={data:function(){return{detail:{},id:""}},onLoad:function(t){var n=this;return c(r.default.mark((function e(){var a;return r.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return n.id=t.id,e.next=3,n.$api.info("news",t.id);case 3:a=e.sent,n.detail=a.data,n.detail.content=n.detail.content.replace(/<img/g,'<img style="width: 100%;"');case 6:case"end":return e.stop()}}),e)})))()}};n.default=i},4977:function(t,n,e){"use strict";e.r(n);var r=e("3f20"),a=e.n(r);for(var u in r)"default"!==u&&function(t){e.d(n,t,(function(){return r[t]}))}(u);n["default"]=a.a},"61cb":function(t,n,e){},"8fb6":function(t,n,e){"use strict";var r=e("61cb"),a=e.n(r);a.a},c430:function(t,n,e){"use strict";var r;e.d(n,"b",(function(){return a})),e.d(n,"c",(function(){return u})),e.d(n,"a",(function(){return r}));var a=function(){var t=this,n=t.$createElement;t._self._c},u=[]}},[["2c4a","common/runtime","common/vendor"]]]);