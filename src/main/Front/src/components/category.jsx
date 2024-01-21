import React from "react";
import { useNavigate } from "react-router-dom";
import '../css/category.css';

const Category = () => {
  const navigate = useNavigate();

  return (
    // 메뉴
    <nav id="gnb" className="bottom">
      <ul className="menu">
        <li className="top">
          <a href="/shop/list.php?cate=0104">아우터</a>
          <ul className="sub">
            <li><a href="/shop/list.php?cate=010401">가디건/조끼</a></li>
            <li><a href="/shop/list.php?cate=010403">야상/점퍼</a></li>
            <li><a href="/shop/list.php?cate=010404">자켓/코트</a></li>
            <li><a href="/shop/list.php?cate=010405">패딩</a></li>
            <li><a href="/shop/list.php?cate=010406">플리스</a></li>
          </ul>
        </li>
        <li className="top">
          <a href="/shop/list.php?cate=0101">상의</a>
          <ul className="sub">
            <li><a href="/shop/list.php?cate=010102">긴팔티셔츠</a></li>
            <li><a href="/shop/list.php?cate=010104">맨투맨</a></li>
            <li><a href="/shop/list.php?cate=010103">후드</a></li>
            <li><a href="/shop/list.php?cate=010101">반팔/민소매티셔츠</a></li>
            <li><a href="/shop/list.php?cate=010105">니트</a></li>
          </ul>
        </li>
        <li><a href="/shop/list.php?cate=0102">셔츠/블라우스</a></li>
        <li><a href="/shop/list.php?cate=0105">트레이닝</a></li>
        <li><a href="/shop/list.php?cate=0407">베이직</a></li>
        <li><a href="/shop/list.php?cate=0103">원피스</a></li>
        <li><a href="/shop/list.php?cate=0202">스커트</a></li>
        <li className="top">
          <a href="/shop/list.php?cate=0201">팬츠</a>
          <ul className="sub">
            <li><a href="/shop/list.php?cate=020103">청바지</a></li>
            <li><a href="/shop/list.php?cate=020104">면바지</a></li>
            <li><a href="/shop/list.php?cate=020106">슬랙스</a></li>
            <li><a href="/shop/list.php?cate=020109">와이드팬츠</a></li>
            <li><a href="/shop/list.php?cate=020101">숏팬츠</a></li>
            <li><a href="/shop/list.php?cate=020112">조거팬츠</a></li>
            <li><a href="/shop/list.php?cate=020115">기장별</a></li>
          </ul>
        </li>
        <li className="top">
          <a href="/shop/list.php?cate=0601">가방</a>
          <ul className="sub">
            <li><a href="/shop/list.php?cate=060101">백팩/스쿨백</a></li>
            <li><a href="/shop/list.php?cate=060102">크로스/토트백</a></li>
          </ul>
        </li>
        <li className="top">
          <a href="/shop/list.php?cate=0501">신발</a>
          <ul className="sub">
            <li><a href="/shop/list.php?cate=050101">운동화/단화</a></li>
            <li><a href="/shop/list.php?cate=050102">구두/워커</a></li>
            <li><a href="/shop/list.php?cate=050103">샌들/슬리퍼/장화</a></li>
          </ul>
        </li>
        <li className="top">
          <a href="/shop/list.php?cate=0701">액세서리</a>
          <ul className="sub">
            <li><a href="/shop/list.php?cate=070101">주얼리</a></li>
            <li><a href="/shop/list.php?cate=070104">패션소품</a></li>
            <li><a href="/shop/list.php?cate=070105">양말/스타킹</a></li>
            <li><a href="/shop/list.php?cate=070108">헤어액세서리</a></li>
          </ul>
        </li>
      </ul>
      <ul className="cateogry">
        <li className="c3"><a href="/shop/delivery.php"></a></li>
      </ul>
    </nav>
  );
}

export default Category;