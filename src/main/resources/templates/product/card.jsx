import React from "react";
import TruckdIcon from "../assets/icon/truck.svg";

export default function Card() {
  return (
    // 상품 카드
    <div className="pt-10 pl-12 pr-12">
      <ul className="mt-0 pt-8 block overflow-x-hidden -mb-16 text-{0px}">
        <li className="inline-block pl-0 align-top tracking-normal text-xs mb-16 p-2 items-center w-80 mr-4 border-2 border-solid border-mustardYellow">
          <div className="pb-64 block relative w-full h-auto overflow-hidden mb-2 max-w-xs max-h-80 transform -translate-x-1/2 left-1/2 ml-1 p-2">
            <a
              className="text-gray-600 no-underline bg-transparent"
              href="/shop/view.php?index_no=321416"
            >
              <img
                className="w-full h-full object-cover rounded-xl"
                src="https://img.sonyunara.com/files/goods/321416/1678954898_5.gif.webp"
                alt="[MADE/기장별,뱃살커버]인생핏 트레이닝 롱일자 밴딩팬츠 숏/기본/롱"
              />
              {/* <!-- 					<img className="list_show_icon" src="https://img.sonyunara.com/2020/icon/best_icon.png" alt=""> --> */}
            </a>
            <a
              href="javascript:"
              className="good "
              onclick=" GoodsProc.new_set_wish_single(321416);"
            >
              {/* <!-- 				<i className="fa fa-heart"></i> --> */}
            </a>
          </div>
          <div className="mt-5 text-{5px}">
            <div className="-mt-5 flex justify-center">
              <div className="text-right"></div>
              <div className="pl-4 italic font-bold flex gap-2 -ml-52">
                <img src={TruckdIcon} alt="card" />
                오늘출발
              </div>
            </div>
            <div className="pt-1 text-xs whitespace-no-wrap overflow-hidden text-gray-600 pb-4 truncate">
              <a
                class="text-mustardGray no-underline bg-transparent overflow-hidden whitespace-nowrap inline-block relative ml-1 mr-1"
                href="/shop/view.php?index_no=321416"
              >
                [MADE/기장별,뱃살커버]인생핏 트레이닝 롱일자 밴딩팬츠 숏/기본/롱
              </a>
            </div>
            <div className="flex justify-center float-right mt-0 items-end">
              <span
                style={{ color: "#ff5252" }}
                className="pl-2 font-bold mb-1"
              >
                46%
              </span>{" "}
              <span className="pl-2 text-lg font-bold">15,900</span>
            </div>
          </div>
        </li>
      </ul>
    </div>
  );
}
