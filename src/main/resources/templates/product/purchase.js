document.querySelector('.btn-purchase a').addEventListener('click', function (e) {
    e.preventDefault();
    const productID = document.getElementById('product-select').value;
    window.location.href = `Purchase.html?product=${productID}`; // 선택한 상품을 쿼리 매개변수로 전달
  });
  