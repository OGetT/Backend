document.querySelector('.btn-product_registration a').addEventListener('click', function (e) {
    e.preventDefault();
    const productID = document.getElementById('product-select').value;
    window.location.href = `product_registration.html?product=${productID}`; // 선택한 상품을 쿼리 매개변수로 전달
  }
  );
  