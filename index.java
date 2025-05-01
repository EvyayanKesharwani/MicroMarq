import React from "react";
import { BrowserRouter as Router, Route, Routes, Link } from "react-router-dom";
import { Card, CardContent } from "@/components/ui/card";
import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { cn } from "@/lib/utils";

function Sidebar() {
  return (
    <div className="w-64 bg-peach text-brownish h-screen p-4 fixed">
      <h1 className="text-2xl font-bold mb-6">MicroMarq</h1>
      <nav className="flex flex-col space-y-4">
        <Link to="/" className="hover:underline">Home</Link>
        <Link to="/shop" className="hover:underline">Shop</Link>
        <Link to="/login" className="hover:underline">Login</Link>
      </nav>
    </div>
  );
}

function Home() {
  return (
    <div className="ml-64 p-8">
      <h2 className="text-4xl font-bold text-light-green mb-4">Welcome to MicroMarq</h2>
      <p className="text-sky-blue mb-6">Fresh. Nutritious. Homegrown Microgreens.</p>
      <div className="h-64 bg-gray-200 rounded-2xl shadow-inner flex items-center justify-center text-gray-500">
        [ Image Slider / Banner Space ]
      </div>
    </div>
  );
}

function Login() {
  return (
    <div className="ml-64 p-8">
      <Card className="max-w-sm mx-auto">
        <CardContent>
          <h2 className="text-xl font-bold mb-4">Login to MicroMarq</h2>
          <form>
            <Input type="email" placeholder="Email" className="mb-4" />
            <Input type="password" placeholder="Password" className="mb-4" />
            <Button type="submit" className="w-full bg-light-green text-white">Login</Button>
          </form>
        </CardContent>
      </Card>
    </div>
  );
}

function App() {
  return (
    <Router>
      <div className="flex">
        <Sidebar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/shop" element={<div className='ml-64 p-8'>[Shop Page Coming Soon]</div>} />
          <Route path="/login" element={<Login />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
