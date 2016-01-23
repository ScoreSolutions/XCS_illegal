function initExciseMenu2(bxAb,byAb,bzAb,BaAb,BbAb,BcAb,BdAb) {
var BfAb = { Bxay: byAb, bZay: bzAb, BAay: BaAb, BKay: BbAb, BLay: BcAb, BMay: BdAb };
ExciseMenu = UniMenu.construct(bxAb, BfAb);
}

function initExciseMenu() {
initExciseMenu2('ExciseMenu_ul',0,1,0,0,100,0);
}

BeAb = window.onload;
window.onload = function(_e)
{
  if (BeAb != null)
  {
    BeAb();
  }
  initExciseMenu();
}


