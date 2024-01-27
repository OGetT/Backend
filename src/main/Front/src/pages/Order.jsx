import React, { useState } from 'react';

export default function Order() {
  const [orders, setOrders] = useState([]);

  const fetchOrders = async () => {
    // 주문 내역 조회 로직 (API 호출 등)
    // 임의의 데이터 사용
    setOrders([
      {
        id: 1,
        name: "상품 A",
        price: 10000,
        type: "티셔츠",
        description: "편안한 티셔츠",
        author: "작성자 A",
        image: "/path/to/imageA.jpg",
        status: "주문됨"
      },
      // 다른 주문들...
    ]);
  };

  const handleCancelOrder = (orderId) => {
    // 주문 취소 로직
    console.log("주문 취소 로직 실행", orderId);
    // 주문 취소 로직 구현. 백엔드 API 연동 필요.
  };

  return (
    <div className="container mx-auto mt-10 p-5 border rounded shadow-lg bg-white">
      <h2 className="text-2xl font-bold mb-5">주문 내역 조회</h2>
      <button onClick={fetchOrders}>주문 내역 조회</button>
      <ul>
        {orders.map(order => (
          <li key={order.id} className="flex justify-between items-center mb-3">
            <img src={order.image} alt={order.name} style={{ width: '50px', height: '50px' }} />
            <span>{order.name} - {order.price}원 - {order.type} - {order.description} - 작성자: {order.author} - 상태: {order.status}</span>
            <button onClick={() => handleCancelOrder(order.id)}>주문 취소</button>
          </li>
        ))}
      </ul>
    </div>
  );
}
