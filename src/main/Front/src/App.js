import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

export default function App() {
  return (
    <Router>
      <Routes>
        <Route path='/' element={<Home />} />
        <Route path='/Login' element={<Login />} />
        <Route path='/Cart' element={<Cart />} />
        <Route path='/Wishlist' element={<Wishlist />} />
        <Route path='/Ai' element={<Ai />} />
      </Routes>
    </Router>
  );
}
