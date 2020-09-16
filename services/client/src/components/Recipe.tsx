import React from "react";

export function Recipe({ recipe }: any) {
    if(recipe) {
      return <div className="Recipe">
        <h1>{recipe.title}</h1>
      </div>
    } else {
      return <div/>
    }
}
