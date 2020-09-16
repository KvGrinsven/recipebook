import * as React from "react";
import { RecipeList } from "./RecipeList";

export class App extends React.Component<any, any> {
  constructor(props: {}) {
    super(props);

    this.state = {
      recipes: [],
    }
  }

  componentDidMount() {
    fetch('grublub/webapi/init')
      .then(response => response.json())
      .then(recipes => this.setState({ recipes }));
  }

  public render(): JSX.Element {
    console.log(this.state);

    return <RecipeList recipes={this.state.recipes}/>
  }
}
