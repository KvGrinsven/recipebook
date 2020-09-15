import * as React from "react";

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

    return <div>
      <h1>Recipes</h1>
      <ul>
        {this.state.recipes.map((item:any) => (
          <li key={item.id}>{item.name}</li>
        ))}
      </ul>
    </div>
  }
}
